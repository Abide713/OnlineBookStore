package com.example.OnlineBookStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users register(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repository.save(user);
		
	}

}


/* For Future Expansion 

    // Fetch all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

 // Fetch a user by ID
    public Users getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    // Add a new user
    public Users addUser(User user) {
        return userRepository.save(user);
    }

    // Update an existing user
    public Users updateUser(Long id, User updatedUser) {
        User user = getUserById(id); // Fetch the user or throw an exception
        user.setUsername(updatedUser.getUsername());
        user.setPassword(updatedUser.getPassword());
        return userRepository.save(user);
    }

    // Delete a user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

*/
