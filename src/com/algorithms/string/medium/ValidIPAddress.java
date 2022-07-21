package com.algorithms.string.medium;

public class ValidIPAddress {
    public String validIPAddress(String IP) {
        if (IP.startsWith(".") || IP.endsWith(".") || IP.startsWith(":") || IP.endsWith(":")) {
            return "Neither";
        } else if (IP.contains(".")) {
            return isValidIPv4(IP) ? "IPv4" : "Neither";
        } else if (IP.contains(":")) {
            return isValidIPv6(IP) ? "IPv6" : "Neither";
        }
        return "Neither";


    }

    private boolean isValidIPv4(String ip) {
        String[] nums = ip.split("\\.");
        if (nums.length != 4) {
            return false;
        }
        int count = 0;
        for (String str : nums) {
            if (str.startsWith("0") && str.length() > 1) {
                return false;
            }
            try {
                Integer intValue = Integer.valueOf(str);
                if (intValue >= 0 && intValue <= 255) {
                    count++;
                }
            } catch (NumberFormatException ex) {
                return false;
            }

        }
        return count == 4;
    }

    private boolean isValidIPv6(String ip) {
        String[] nums = ip.split(":");
        if (nums.length != 8) {
            return false;
        }
        int count = 0;
        for (String str : nums) {
            if (str.length() >= 5 || str.length() < 1) {
                return false;
            }

            try {
                Integer.valueOf(str);
            } catch (NumberFormatException ex) {
                for (char ch : str.toCharArray()) {
                    if ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F') || Character.isDigit(ch)) {

                    } else {
                        return false;
                    }
                }
            }
            count++;
        }

        return count == 8;
    }

    public static void main(String[] args) {
        ValidIPAddress ip = new ValidIPAddress();
        ip.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334");
    }
}
