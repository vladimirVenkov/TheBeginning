package venkov.vladimir.thebeginning.diconfig;

import dagger.Module;
import dagger.Provides;
import venkov.vladimir.thebeginning.models.Accommodation;
import venkov.vladimir.thebeginning.models.User;
import venkov.vladimir.thebeginning.repositories.base.RatingRepository;
import venkov.vladimir.thebeginning.repositories.base.Repository;
import venkov.vladimir.thebeginning.services.AccommodationService;
import venkov.vladimir.thebeginning.services.HttpAccommodationsService;
import venkov.vladimir.thebeginning.services.HttpRatingService;
import venkov.vladimir.thebeginning.services.HttpUsersService;
import venkov.vladimir.thebeginning.services.RatingService;
import venkov.vladimir.thebeginning.services.UserService;
import venkov.vladimir.thebeginning.validatiors.base.Validator;

@Module
public class ServicesModule {
    @Provides
    public UserService userService(Repository<User> repository, Validator<User> validator, RatingRepository ratingRepository) {
        return new HttpUsersService(repository, validator, ratingRepository);
    }

    @Provides
    public AccommodationService accommodationService(Repository<Accommodation> repository, Validator<Accommodation> validator) {
        return new HttpAccommodationsService(repository, validator);
    }

    @Provides
    RatingService ratingService(RatingRepository repository) {
        return new HttpRatingService(repository);
    }
}
