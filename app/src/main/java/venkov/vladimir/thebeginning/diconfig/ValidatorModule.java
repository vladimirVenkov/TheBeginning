package venkov.vladimir.thebeginning.diconfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import venkov.vladimir.thebeginning.models.Accommodation;
import venkov.vladimir.thebeginning.models.User;
import venkov.vladimir.thebeginning.validatiors.UserValidator;
import venkov.vladimir.thebeginning.validatiors.base.AccommodationValidator;
import venkov.vladimir.thebeginning.validatiors.base.Validator;

@Module
public class ValidatorModule {
    @Provides
    @Singleton
    public Validator<User> userValidator(){
        return new UserValidator();
    }

    @Provides
    @Singleton
    public Validator<Accommodation> accommodationValidator(){
        return new AccommodationValidator();
    }
}

