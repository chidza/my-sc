package zw.co.elearning.school.service.impl;

import zw.co.elearning.school.service.UnitService;
import zw.co.elearning.school.domain.Unit;
import zw.co.elearning.school.repository.UnitRepository;
import zw.co.elearning.school.service.dto.UnitDTO;
import zw.co.elearning.school.service.mapper.UnitMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing Unit.
 */
@Service
@Transactional
public class UnitServiceImpl implements UnitService{

    private final Logger log = LoggerFactory.getLogger(UnitServiceImpl.class);
    
    private final UnitRepository unitRepository;

    private final UnitMapper unitMapper;

    public UnitServiceImpl(UnitRepository unitRepository, UnitMapper unitMapper) {
        this.unitRepository = unitRepository;
        this.unitMapper = unitMapper;
    }

    /**
     * Save a unit.
     *
     * @param unitDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public UnitDTO save(UnitDTO unitDTO) {
        log.debug("Request to save Unit : {}", unitDTO);
        Unit unit = unitMapper.unitDTOToUnit(unitDTO);
        unit = unitRepository.save(unit);
        UnitDTO result = unitMapper.unitToUnitDTO(unit);
        return result;
    }

    /**
     *  Get all the units.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<UnitDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Units");
        Page<Unit> result = unitRepository.findAll(pageable);
        return result.map(unit -> unitMapper.unitToUnitDTO(unit));
    }

    /**
     *  Get one unit by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public UnitDTO findOne(String id) {
        log.debug("Request to get Unit : {}", id);
        Unit unit = unitRepository.findOne(id);
        UnitDTO unitDTO = unitMapper.unitToUnitDTO(unit);
        return unitDTO;
    }

    /**
     *  Delete the  unit by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Unit : {}", id);
        unitRepository.delete(id);
    }
}
