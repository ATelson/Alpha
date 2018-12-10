package sandbox;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The Employee class creates an Employee object that is used in order to create an audit trail on
 * its tests of the production line so that it records which employee ran the test.
 */
public class EmployeeInfo {

  private StringBuilder name;

  private String code;
  private String deptId;

  private Pattern pattern;
  private Scanner in;

  /**
   * Constructor used to create an Employee object prompting the user begin entering information
   * that is passed into the object.
   */
  EmployeeInfo() {
    in = new Scanner(System.in);

    setName();
    String regex = "[A-Z][^A-Z][^A-Z][^A-Z]\\d{2}";
    pattern = Pattern.compile(regex);
    setDeptId();
    in.close();
    System.out.println(toString());
  }

  /**
   * Used to get name for employee object.
   */
  private StringBuilder getName() {
    return name;
  }

  /**
   * Used to get employee code.
   */
  private String getCode() {
    return code;
  }

  /**
   * Used to create name for employee object.
   */
  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);

    createEmployeeCode(name);
  }

  /**
   * Used to create an employee code based on the user's name. The code format includes four letters
   * and two numbers. The first letter must be in uppercase with the following three all being
   * lowercase and no spaces.
   *
   * @param name uses the user's name as a parameter.
   */
  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { // valid, includes space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "guest";
    }
  }

  /**
   * Used to prompt the user to enter their first and last name and store it into a String.
   */
  private String inputName() {
    String nameString;
    System.out.println("Please enter your first and last name : ");
    nameString = in.nextLine();
    return nameString;
  }

  /**
   * Used to check the user's name to make sure it is a valid name.
   */
  private boolean checkName(StringBuilder name) {
    return name.indexOf(" ") > 0;
  }

  /**
   * used to return department ID.
   */
  private String getDeptId() {
    boolean done = false;
    deptId = null;
    while (!done) {
      System.out.println("Enter the department ID : ");
      deptId = in.nextLine();
      reverseString(deptId);
      if (validId(deptId)) {
        done = true;
      } else {
        System.out.println("Invalid ID, try again.");
        done = false;
      }
    }
    return deptId;
  }

  /**
   * set deptID must consist of four letters and two numbers uppercase letter, 3 lowercase letters,
   * and 2 numbers.
   */
  private void setDeptId() {
    deptId = getDeptId();
  }

  /**
   * checks to see if the department ID is matches the department ID pattern.
   *
   * @param checkId is entered by the user that is then passed into the method as a parameter.
   */
  private boolean validId(String checkId) {
    return pattern.matcher(checkId).matches();
  }

  /**
   * used to display the user's employee code.
   */
  @Override
  public String toString() {
    return "Code: " + getCode();
  }

  /**
   * accepts the user's validated ID as a parameter and returns the string in reverse to prevent any
   * leaks of proprietary information.
   *
   * @param id is the validated ID created by the user.
   */
  private String reverseString(String id) {

    if ((id == null) || (id.length() <= 1)) {

      System.out.println(id);
    } else {
      System.out.print(id.charAt(id.length() - 1));
      reverseString(id.substring(0, id.length() - 1));
    }
    return id;
  }
}