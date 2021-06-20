package com.dvlcube.app.jpa.repo;

import com.dvlcube.app.jpa.BasicRepository;
import com.dvlcube.app.jpa.DvlRepository;
import com.dvlcube.app.manager.data.JobBean;

import java.util.Optional;

/**
 * @since 19 de jun de 2021
 * @author Gabriel Jacobina
 */
public interface JobRepository extends DvlRepository<JobBean, Long>, BasicRepository<JobBean, Long> {
    Optional<JobBean> findByName(String name);
}
