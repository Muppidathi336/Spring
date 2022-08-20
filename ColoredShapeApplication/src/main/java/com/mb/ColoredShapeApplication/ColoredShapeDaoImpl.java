package com.mb.ColoredShapeApplication;

//below for hibernate alone(use session factory), the actual for hibernate and jpa(use EM)
/*
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ColoredShapeDaoImpl implements ColoredShapeDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {

        return this.sessionFactory.getCurrentSession();
    }


    public ColoredShape findById(final Long id) {

        return getSession().get(ColoredShape.class, id);
    }


    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void save(final ColoredShape coloredShape) {

        getSession().saveOrUpdate(coloredShape);
    }
}
*/

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(readOnly = true)
public class ColoredShapeDaoImpl implements ColoredShapeDao {

    @PersistenceContext
    private EntityManager em;


    public ColoredShape findById(final Long id) {

        return (ColoredShape) em
                .createQuery("SELECT c FROM ColoredShape c WHERE c.id LIKE :id")
                .setParameter("id", id)
                .setMaxResults(1)
                .getResultList().get(0);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void save(final ColoredShape coloredShape) {

        em.merge(coloredShape);
    }
}
