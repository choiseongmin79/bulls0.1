package kr.ulsan.bulls;

import kr.ulsan.bulls.dto.Agent;
import kr.ulsan.bulls.dto.Farm;
import kr.ulsan.bulls.dto.Office;
import kr.ulsan.bulls.dto.Person;
import kr.ulsan.bulls.repository.MemberRepository;
import kr.ulsan.bulls.repository.MemberRepositoryImpl;
import kr.ulsan.bulls.service.JoinService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.swing.plaf.SpinnerUI;

@Configuration
public class Config {
    private final DataSource dataSource;


    public Config(DataSource dataSource){
        this.dataSource = dataSource;

    }
    @Bean
    public JoinService joinService(){
        return new JoinService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepositoryImpl(dataSource);
    }

    @Bean
    public Farm farm(){
        return new Farm();
    };
    @Bean
    public Agent agent(){
        return new Agent();
    }
    @Bean
    public Office office(){
        return new Office();
    }
    @Bean
    public Person person(){
        return new Person();
    }


}
