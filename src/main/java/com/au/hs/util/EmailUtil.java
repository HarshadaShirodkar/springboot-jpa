package com.au.hs.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUtil {

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(email);
        return m.matches();
    }

   /* public static String createEmailID(Tutorial user) {
        String generatedId = user.getFirstName() + "." + user.getLastName() + "@testdomain.com";
        return generatedId;
    }


    public static boolean emailExists(Tutorial user) {
        ObjectMapper objectMapper = new ObjectMapper();
        boolean isEmailExists = false;
        try {
            List<Tutorial> userList = Arrays.asList(objectMapper.readValue(new File("data/test.json"), Tutorial[].class));
            System.out.println("userList :" + userList);

            for (Tutorial userDetails : userList) {
                if (userDetails.getEmail().equalsIgnoreCase(user.getEmail()))
                    isEmailExists = true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("isEmailExists :" + isEmailExists);
        return isEmailExists;
    }
*/
}
