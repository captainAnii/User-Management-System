# User-Management-System

- This is Validation Branch. I had done some changes in User Management System, which are validations on variable.

## Validations
| Vaiables | Validations | Use of Validation |
|----------|-------------|-------------------|
| firstName | @NotBlank | First name cannot be blank |
|           | @Size=30  | First name must be at most 30 characters long|
| lastName  | @NotBlank | last name cannot be blank |
|           | @Size=30  | last name must be at most 30 characters long|
| userEmail | @NotBlank | last name cannot be blank |
|           | @Email    | checking email id is valid or not |
| userPhoneNumber | @NotBlank | last name cannot be blank |
|           | @Pattern regexp = "[0-9]+"| Phone number must contain only digits |
| age | @NotNull | Age cannot be null |
|     | @Positive | Age must be a positive value |
| dob | @NotNull | Date of birth cannot be null |
|department | @NotBlank | Department cannot be blank |

## API Endpoints

The following API endpoints are available in the system:

- POST /api/users: Create a new user.
- GET /api/users/{userId}: Get a specific user by their user ID.
- GET /api/users: Get all users.
- PUT /api/users/{userId}: Update a specific user by their user ID.
- DELETE /api/users/{userId}: Delete a specific user by their user ID.

## User Model

The following attributes are available in the User model:

- userId: Integer
- firstName : String
- lastName : String
- username: String
- dateOfBirth: String (yyyy-MM-dd)
- email: String
- phoneNumber: String (12 digits, first 2 digits being the country code)
- date of birth : String (yyyy-MM-dd)
- age : integer
- department : string

## Validation Annotations

The following validation annotations have been used in the system:

- @NotNull
- @Size
- @Pattern
- @Min
- @Max
- @NotBlank
- @Positive

For more information about these annotations, please refer to the following link: https://www.geeksforgeeks.org/spring-boot-annotations/

## How to Run the Application

To run the application, you will need to have Java and Maven installed on your system. Once you have these installed, follow these steps:

1. Clone the repository to your local machine.
2. Open a command prompt or terminal and navigate to the project directory.
3. Run the command `mvn spring-boot:run` to start the application.
4. The application should now be running on http://localhost:8080.

## License

This project is licensed under the MIT License - see the LICENSE file for details
