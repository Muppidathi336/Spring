package com.mb.Ex01_DB_XMLConfigured;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class ColoredShapeDaoImplEx01 implements ColoredShapeDao {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public ColoredShapeDaoImplEx01(final DataSource dataSource) {

        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(final int id, final String color, final String shape) {

        String sql = "insert into coloredshape (id, color, shape) values (?, ?, ?)";

        jdbcTemplate.update(sql, id, color, shape);

        System.out.println("Added to DB, ID[" + id + "]: Color: [" + color + "], Shape: [" + shape + "]");
    }


    public ColoredShape getColoredShape(final int id) {

        String sql = "select * from coloredshape where id = ?";

        ColoredShape coloredShape = jdbcTemplate.queryForObject(sql, new Object[]{id}, new ColoredShapeMapper());

        return coloredShape;
    }


    public List<ColoredShape> listColoredShapes() {

        String sql = "select * from coloredshape";

        List<ColoredShape> coloredShapes = jdbcTemplate.query(sql, new ColoredShapeMapper());

        return coloredShapes;
    }


    public void update(final int id, final String color, final String shape) {

        String sql = "update coloredshape set color = ?, shape = ? where id = ?";

        jdbcTemplate.update(sql, color, shape, id);

        System.out.println("Updated in DB, ID[" + id + "]: Color: [" + color + "], Shape: [" + shape + "]");
    }


    public void delete(final int id) {

        String sql = "delete from coloredshape where id = ?";

        jdbcTemplate.update(sql, id);

        System.out.println("Deleted in DB, ID[" + id + "]");
    }


    private static final class ColoredShapeMapper implements RowMapper<ColoredShape> {

        public ColoredShape mapRow(ResultSet rs, int rowNum) throws SQLException {

            ColoredShape user = new ColoredShape();
            user.setId(rs.getLong("id"));
            user.setColor(rs.getString("color"));
            user.setShape(rs.getString("shape"));
            return user;
        }
    }

}