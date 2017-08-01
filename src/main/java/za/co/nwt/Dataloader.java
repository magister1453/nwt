package za.co.nwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import za.co.nwt.repository.FlatRepository;
import za.co.nwt.repository.TenantRepository;

/**
 * Created by marc.marais on 2017-08-01.
 */
public class Dataloader implements ApplicationRunner {

    private FlatRepository flatRepository;
    private TenantRepository tenantRepository;

    @Autowired
    public Dataloader(FlatRepository flatRepository, TenantRepository tenantRepository){
        this.flatRepository = flatRepository;
        this.tenantRepository = tenantRepository;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

    }
}
