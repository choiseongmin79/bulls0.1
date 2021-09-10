package kr.ulsan.bulls.repository;

import kr.ulsan.bulls.dto.Agent;
import kr.ulsan.bulls.dto.Farm;
import kr.ulsan.bulls.dto.Office;
import kr.ulsan.bulls.dto.Person;
import kr.ulsan.bulls.form.MemberForm;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Person PersonSave(Person person);
    Optional<Person> PersonFindById(Long id);
    Optional<Person> PersonFindByName(String name);
    List<Person> PersonFindAll();

    Farm FarmSave(Farm farm);
    Optional<Farm> FarmFindById(Long id);
    Optional<Farm> FarmFindByName(String name);
    List<Farm> FarmFindAll();

    Agent AgentSave(Agent agent);
    Optional<Agent> AgentFindById(Long id);
    Optional<Agent> AgentFindByName(String name);
    List<Agent> AgentFindAll();

    Office OfficeSave(Office office);
    Optional<Office> OfficeFindById(Long id);
    Optional<Office> OfficeFindByName(String name);
    List<Office> OfficeFindAll();
}
