
    package org.example.services;

    import org.springframework.stereotype.Component;
    import org.springframework.stereotype.Service;

    import java.util.logging.Logger;

    @Service
    public class Userservice {
        Logger logger= Logger.getLogger(Userservice.class.getName());
        public void addUser(String user) {
           logger.info("User added: " + user);
        }

        public void deleteUser(String user) {
            logger.info("User deleted: " + user);
        }

}
