package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.IRepoMahasiswa;
import repository.RepoMahasiswa;
import services.IServiceApp;
import services.ServiceApp;

@Configuration
public class BeanConfiguration {
    @Bean
    public IRepoMahasiswa getRepoMahasiswa(){
        return new RepoMahasiswa();
    }
    
    @Bean
    public IServiceApp getServiceApp(){
        return new ServiceApp(getRepoMahasiswa());
    }
}
