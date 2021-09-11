package kr.ulsan.bulls.repository;

import kr.ulsan.bulls.dto.Agent;
import kr.ulsan.bulls.dto.Farm;
import kr.ulsan.bulls.dto.Office;
import kr.ulsan.bulls.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemberRepositoryImpl implements MemberRepository {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    private Farm farm;
    @Autowired
    private Agent agent;
    @Autowired
    private Office office;
    @Autowired
    private Person person;
    public MemberRepositoryImpl(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }


    @Override
    public Person PersonSave(Person person) {
        SimpleJdbcInsert jdbcInsert=new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("person").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", person.getName());
        parameters.put("password", person.getPassword());
        parameters.put("nickname", person.getNickname());
        parameters.put("birthday", person.getBirthday());
        parameters.put("cellphone", person.getCellphone());
        parameters.put("address", person.getAddress());
        parameters.put("membertype", person.getMembertype());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
        person.setId(key.longValue());
        return person;
    }

    @Override
    public Optional<Person> PersonFindById(Long id) {
        List<Person> result = jdbcTemplate.query("select * from person where id=?",personRowMapper(),id);
        return result.stream().findAny();
    }

    @Override
    public Optional<Person> PersonFindByName(String name) {
        List<Person> result = jdbcTemplate.query("select * from person where name=?",personRowMapper(),name);
        return result.stream().findAny();
    }

    @Override
    public List<Person> PersonFindAll() {
        return jdbcTemplate.query("select * from person",personRowMapper());
    }

    private RowMapper<Person> personRowMapper(){
        return new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
                person.setId(rs.getLong("id"));
                person.setName(rs.getString("name"));
                person.setPassword(rs.getString("password"));
                person.setNickname(rs.getString("nickname"));
                person.setBirthday(rs.getString("birthday"));
                person.setCellphone(rs.getString("cellphone"));
                person.setAddress(rs.getString("address"));
                person.setMembertype(rs.getString("membertype"));
                return person;
            }
        };
    }

    public Farm FarmSave(Farm farm) {
        SimpleJdbcInsert jdbcInsert=new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("farm").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", farm.getName());
        parameters.put("phone", farm.getPhone());
        parameters.put("address", farm.getAddress());
        parameters.put("farmno", farm.getFarmno());
        parameters.put("ownid", person.getId());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
        farm.setId(key.longValue());
        return farm;
    }
    @Override
    public Optional<Farm> FarmFindById(Long id) {
        List<Farm> result = jdbcTemplate.query("select * from farm where id=?",farmRowMapper(),id);
        return result.stream().findAny();
    }

    @Override
    public Optional<Farm> FarmFindByName(String name) {
        List<Farm> result = jdbcTemplate.query("select * from farm where name=?",farmRowMapper(),name);
        return result.stream().findAny();
    }

    @Override
    public List<Farm> FarmFindAll() {
        return jdbcTemplate.query("select * from farm",farmRowMapper());
    }

    private RowMapper<Farm> farmRowMapper(){
        return new RowMapper<Farm>() {
            @Override
            public Farm mapRow(ResultSet rs, int rowNum) throws SQLException {
                farm.setId(rs.getLong("id"));
                farm.setName(rs.getString("name"));
                farm.setPhone(rs.getString("phone"));
                farm.setAddress(rs.getString("address"));
                farm.setFarmno(rs.getString("farmno"));
                farm.setOwnid(rs.getLong("ownid"));
                return farm;
            }
        };
    }

    public Agent AgentSave(Agent agent) {
        SimpleJdbcInsert jdbcInsert=new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("agent").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", agent.getName());
        parameters.put("address", agent.getAddress());
        parameters.put("phone", agent.getPhone());
        parameters.put("license", agent.getLicense());
        parameters.put("membertype", agent.getMembertype());
        parameters.put("ownid", person.getId());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
        agent.setId(key.longValue());
        return agent;
    }
    @Override
    public Optional<Agent> AgentFindById(Long id) {
        List<Agent> result = jdbcTemplate.query("select * from agent where id=?",agentRowMapper(),id);
        return result.stream().findAny();
    }

    @Override
    public Optional<Agent> AgentFindByName(String name) {
        List<Agent> result = jdbcTemplate.query("select * from agent where name=?",agentRowMapper(),name);
        return result.stream().findAny();
    }

    @Override
    public List<Agent> AgentFindAll() {
        return jdbcTemplate.query("select * from agent",agentRowMapper());
    }

    private RowMapper<Agent> agentRowMapper(){
        return new RowMapper<Agent>() {
            @Override
            public Agent mapRow(ResultSet rs, int rowNum) throws SQLException {
                agent.setId(rs.getLong("id"));
                agent.setName(rs.getString("name"));
                agent.setAddress(rs.getString("address"));
                agent.setMembertype(rs.getString("membertype"));
                agent.setPhone(rs.getString("phone"));
                agent.setLicense(rs.getString("license"));
                agent.setOwnid(rs.getLong("ownid"));
                return agent;
            }
        };
    }

    public Office OfficeSave(Office office) {
        SimpleJdbcInsert jdbcInsert=new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("office").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", office.getName());
        parameters.put("address", office.getAddress());
        parameters.put("phone", office.getPhone());
        parameters.put("officeno", office.getOfficeNo());
        parameters.put("membertype", office.getMembertype());
        parameters.put("ownid", person.getId());
        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
        office.setId(key.longValue());
        return office;
    }
    @Override
    public Optional<Office> OfficeFindById(Long id) {
        List<Office> result = jdbcTemplate.query("select * from office where id=?",officeRowMapper(),id);
        return result.stream().findAny();
    }

    @Override
    public Optional<Office> OfficeFindByName(String name) {
        List<Office> result = jdbcTemplate.query("select * from office where name=?",officeRowMapper(),name);
        return result.stream().findAny();
    }

    @Override
    public List<Office> OfficeFindAll() {
        return jdbcTemplate.query("select * from office",officeRowMapper());
    }

    private RowMapper<Office> officeRowMapper(){
        return new RowMapper<Office>() {
            @Override
            public Office mapRow(ResultSet rs, int rowNum) throws SQLException {
                office.setId(rs.getLong("id"));
                office.setName(rs.getString("name"));
                office.setAddress(rs.getString("address"));
                office.setMembertype(rs.getString("membertype"));
                office.setPhone(rs.getString("phone"));
                office.setOfficeNo(rs.getString("officeno"));
                office.setOwnid(rs.getLong("ownid"));
                return office;
            }
        };
    }

}
