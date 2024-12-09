package com.example.OnlineBookStore;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	//Backend Only (further expansion needed)
	@PostMapping("/register")
	public Users register(@RequestBody Users user) {
		return service.register(user);
	}
}

/* For Future Expansion

@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	//get all users
	@GetMapping
	public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
	// Get a user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    // Add a user
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // Update a user
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser);
    }

    // Delete a user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

*/

