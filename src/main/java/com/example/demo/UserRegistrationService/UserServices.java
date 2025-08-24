package com.example.demo.UserRegistrationService;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("UserServices")
public class UserServices {
    @Value("${repository.type:memory}")
    private String userRepositoryType;

    @Value("${notification.type:email}")
    private String notificationServiceType;

    final private UserRepositoryInterface userRepository;

    final private NotificationServiceInterface notificationService;

    public UserServices(UserRepositoryInterface userRepository, NotificationServiceInterface notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    //注册用户
    public void registerUser(User user) {
        String email = user.getEmail();
        if (userRepository.findByEmail(email) != null) {
            System.out.println("User with email " + email + " already exists.");
            return;
        }
        userRepository.save(user);
        notificationService.sendNotification("Welcome " + user.getName() + "!", email);
    }
}