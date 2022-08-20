package com.mb.ColoredShapeApplication;

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