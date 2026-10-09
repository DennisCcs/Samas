package pe.edu.upeu.sysventas.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.model.Marca;

public class MarcaRepository extends AbstractJpaRepository<Marca,Long >{

    @Override
    protected String getPkColumn() {
        return "id_marca";
    }

    @Override
    protected String getTableName() {
        return "marca";
    }

    @Override
    protected Marca insert(Connection connection, Marca entity) throws SQLException {
        long id=executeInsertGetKey(connection, 
            " insert intro marca(nombre) values(?) "
            , entity.getNombre());
        entity.setIdMarca(id);
        return null;
    }

    @Override
    protected Marca updateRow(Connection connection, Marca entity) throws SQLException {
        executeUpdate(connection, " update marca set nombre=? where id_marca=? ",
         entity.getNombre(), 
         entity.getIdMarca());
        return entity;
    }

    @Override
    protected Marca mapRow(ResultSet rs) throws SQLException {
        return Marca.builder()
        .idMarca(rs.getLong("id_marca"))
        .nombre(rs.getString("nombre"))
        .build();
    }
}
