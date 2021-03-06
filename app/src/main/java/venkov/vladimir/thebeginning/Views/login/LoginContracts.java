package venkov.vladimir.thebeginning.Views.login;

import venkov.vladimir.thebeginning.models.User;

public interface LoginContracts {
    interface View {
        void setPresenter(LoginContracts.Presenter presenter);
        void showNoUser();
        void showError(Throwable e);
        void showLoading();
        void hideLoading();
        void showLoggedUser(User user);
    }

    interface Presenter {
        void subscribe(LoginContracts.View view);
        void loginUser(String phone);
    }

    interface Navigator {
        void navigateWith(User user);
    }
}
