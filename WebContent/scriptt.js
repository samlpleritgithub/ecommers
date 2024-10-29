document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting

    const username = document.getElementById('username').value.trim();
    const password = document.getElementById('password').value.trim();
    const errorMessage = document.getElementById('error-message');

    // Clear previous error message
    errorMessage.style.display = 'none';

    // Validation rules
    if (username.length < 3) {
        errorMessage.textContent = 'Username must be at least 3 characters long.';
        errorMessage.style.display = 'block';
        return;
    }

    if (username.length > 20) {
        errorMessage.textContent = 'Username cannot exceed 20 characters.';
        errorMessage.style.display = 'block';
        return;
    }

    function validatePassword(password) {
        const minLength = 8;
        const hasUppercase = /[A-Z]/.test(password);
        const hasLowercase = /[a-z]/.test(password);
        const hasNumber = /\d/.test(password);
        const hasSpecialChar = /[!@#$%^&*]/.test(password);
        const isLongEnough = password.length >= minLength;
    
        if (!isLongEnough) {
            return 'Password must be at least 8 characters long.';
        }
        if (!hasUppercase) {
            return 'Password must include at least one uppercase letter.';
        }
        if (!hasLowercase) {
            return 'Password must include at least one lowercase letter.';
        }
        if (!hasNumber) {
            return 'Password must include at least one number.';
        }
        if (!hasSpecialChar) {
            return 'Password must include at least one special character.';
        }
    
        return 'Password is valid.';
    }
    
    // Example usage
    const passwordInput = 'Password1!';
    const validationMessage = validatePassword(passwordInput);
    console.log(validationMessage);  // Output: Password is valid.
    

    // Simulate login success
   

    document.getElementById('loginbutton').addEventListener('click',function()
{
    window.location.href='index.html';
})
    // Here you can add your login logic (e.g., API call)
});