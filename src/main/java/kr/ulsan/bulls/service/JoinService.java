package kr.ulsan.bulls.service;

import kr.ulsan.bulls.dto.Agent;
import kr.ulsan.bulls.dto.Farm;
import kr.ulsan.bulls.dto.Office;
import kr.ulsan.bulls.dto.Person;
import kr.ulsan.bulls.form.MemberForm;
import kr.ulsan.bulls.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Slf4j
public class JoinService {

    private final MemberRepository memberRepository;
    @Autowired
    private Farm farm;
    @Autowired
    private Agent agent;
    @Autowired
    private Office office;
    @Autowired
    private Person person;

    public JoinService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
       }

    public Long Join(MemberForm form){

          PersonJoin(form);
          if(form.getMemberType().equals("0")){
              FarmJoin(form);
          }else if(form.getMemberType().equals("1")||form.getMemberType().equals("2")){
              AgentJoin(form);
          }else {
              OfficeJoin(form);
          }

        return null;
    }
    public Long FarmJoin(MemberForm form){
        farm.setName(form.getName());
        farm.setAddress(form.getAddress());
        farm.setPhone(form.getFarmPhone());
        farm.setFarmno(form.getFarmNo());
        farm.setMembertype(form.getMemberType());
        memberRepository.FarmSave(farm);
        return farm.getId();
    }
    public Long AgentJoin(MemberForm form){
        agent.setName(form.getName());
        agent.setAddress(form.getAddress());
        agent.setPhone(form.getFarmPhone());
        agent.setLicense(form.getFarmNo());
        agent.setMembertype(form.getMemberType());
        memberRepository.FarmSave(farm);
        return farm.getId();
    }
    public Long OfficeJoin(MemberForm form){
        office.setName(form.getName());
        office.setAddress(form.getAddress());
        office.setPhone(form.getFarmPhone());
        office.setOfficeNo(form.getFarmNo());
        office.setMembertype(form.getMemberType());
        memberRepository.FarmSave(farm);
        return farm.getId();
    }

    public Long PersonJoin(MemberForm form){

        person.setName(form.getName());
        person.setNickname(form.getAddress());
        person.setAddress(form.getFarmPhone());
        person.setPassword(form.getFarmNo());
        person.setCellphone(form.getMemberType());
        person.setMembertype(form.getMemberType());
        person.setBirthday(form.getMemberType());
        memberRepository.PersonSave(person);
        return person.getId();
    }

    public List<Person> PersonList(){
        return memberRepository.PersonFindAll();
    }
    public Optional<Person> findOne(Long id){
        return memberRepository.PersonFindById(id);
    }

}
