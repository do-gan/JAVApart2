import javax.swing.JOptionPane;
class Person 
{
    private String name;
    // Getter and Setter methods for name
    public String getName() {
        return name;
    }   
    public void setName(String name) 
    {
        this.name = name;
    }

    // Method to check if the name is a palindrome
    public boolean isPalindrome() 
    {  
        String cleanedName = cleanName(name);
        //  checking if the string is a palindrome by comparing characters from both ends
        int left = 0;
        int right = cleanedName.length() - 1;
        while (left < right) {
            if (cleanedName.charAt(left) != cleanedName.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }   
    public String cleanName(String name) 
    {
        String cleanedName = "";
        for (int i = 0; i < name.length(); i++) 
        {
            char c = name.charAt(i);
            if (c != ' ') {
                cleanedName += Character.toLowerCase(c);
            }
        }
        return cleanedName;
    }
}

class PalindromeChecker 
{
    // Method to get user input and check if it is a palindrome
    public static void checkPalindrome() {
        String nameInput = JOptionPane.showInputDialog("Enter a name to check if it is a palindrome:");

        // If the user cancels or does not input a name, exit the program
        if (nameInput == null || nameInput.trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No name entered. Exiting program.");
            return; 
        }

        //  Person object
        Person person = new Person();
        person.setName(nameInput);

        // Checking if the name is a palindrome and display the result
        if (person.isPalindrome()) 
        {
            JOptionPane.showMessageDialog(null, person.getName() + " is a palindrome.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, person.getName() + " is not a palindrome.");
        }
    }

    public static void main(String[] args) 
    {
        checkPalindrome();
    }
}