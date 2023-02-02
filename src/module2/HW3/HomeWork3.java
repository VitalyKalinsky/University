package module2.HW3;

import java.net.SocketException;
import java.nio.file.AccessDeniedException;
import java.rmi.server.ExportException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeWork3 {

    /**
     * �������:
     * <p>
     * 1. ���������� ����� raiseException(����) ������� �������� ����� � ����������� ����������:
     * ���� ����� 1 �� ��������� SocketException
     * ���� ����� 2 �� ��������� ClassNotFoundException
     * ���� ����� 3 �� ��������� AccessDeniedException
     * ���� ����� 4 �� ��������� ExportException
     * <p>
     * 2. ���������� ����� catchException ������� �������� raiseException ����� ����� ������
     * ���������� ��������� ������ catch � ���������� ��� ��������:
     * ��� SocketException ������� ������ "SocketException"
     * ��� ClassNotFoundException ������� ������ "ClassNotFoundException"
     * ��� AccessDeniedException ������� ������ "AccessDeniedException"
     * ��� ExportException ������� ������ "ExportException"
     */

    public static void main(String[] args) {
        testFirstTask();
        testSecondTask();
    }

    public static void raiseException(Integer exceptionId) throws SocketException, ClassNotFoundException,
            AccessDeniedException, ExportException {
        switch (exceptionId) {
            case 1:
                throw new SocketException();
            case 2:
                throw new ClassNotFoundException();
            case 3:
                throw new AccessDeniedException(exceptionId.toString());
            case 4:
                throw new ExportException(exceptionId.toString());
        }
    }

    public static String catchException(Integer integer) {
        try {
            raiseException(integer);
        } catch (SocketException e) {
            return "SocketException";
        } catch (ClassNotFoundException e) {
            return "ClassNotFoundException";
        } catch (AccessDeniedException e) {
            return "AccessDeniedException";
        } catch (ExportException e) {
            return "ExportException";
        }
        return "Exception";
    }

    private static final Map<Integer, Class<? extends Exception>> classesCorrelation = Map.of(
            1, SocketException.class,
            2, ClassNotFoundException.class,
            3, AccessDeniedException.class,
            4, ExportException.class
    );

    public static void testFirstTask() {
        System.out.println("\nTests for raiseException");
        AntiCheat.run();
        for (Integer exceptionId : classesCorrelation.keySet().stream().sorted().collect(Collectors.toList())) {
            try {
                raiseException(exceptionId);
                printTestCase(exceptionId, "������ ���� ���������� ������", "������ �� ����������", 45);
            } catch (Exception e) {
                printTestCase(exceptionId, classesCorrelation.get(exceptionId).toString(), e.getClass().toString(), 45);
            }
        }
    }

    public static void testSecondTask() {
        System.out.println("\nTests for catchException");
        AntiCheat.run();
        Function<String, String> f = str -> {
            List<String> r = Arrays.stream(str.split("\\.")).collect(Collectors.toList());
            return r.get(r.size() - 1);
        };
        for (Integer exceptionId : classesCorrelation.keySet().stream().sorted().collect(Collectors.toList()))
            printTestCase(exceptionId, f.apply(classesCorrelation.get(exceptionId).toString()), catchException(exceptionId), 30);
    }

    public static class AntiCheat {
        public static void run() {
            StringBuilder sb = new StringBuilder("");
            List<String> antiCheatList = new ArrayList<>();
            antiCheatList.addAll(classesCorrelation.keySet().stream().map(Object::toString).collect(Collectors.toList()));
            antiCheatList.addAll(classesCorrelation.values().stream().map(Object::toString).collect(Collectors.toList()));
            antiCheatList.add(sb.toString());
            calcHash(antiCheatList);
        }

        ;

        public static String bytesToHex(byte[] bytes) {
            char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
            char[] hexChars = new char[bytes.length * 2];
            for (int j = 0; j < bytes.length; j++) {
                int v = bytes[j] & 0xFF;
                hexChars[j * 2] = HEX_ARRAY[v >>> 4];
                hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
            }
            return new String(hexChars);
        }

        public static void calcHash(List<String> list) {
            String total = String.join("", list);
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(total.getBytes());
                byte[] digest = md.digest();
                System.out.println("AntiCheatCheck: " + bytesToHex(digest));
            } catch (NoSuchAlgorithmException ignored) {
            }
        }
    }

    public static String constLen(String str, int len) {
        StringBuilder sb = new StringBuilder(str);
        while (len-- - str.length() > 0) sb.append(" ");
        return sb.toString();
    }

    public static void printTestCase(int n, String exp, String act, int minLen) {
        Function<String, String> green = str -> "\u001B[34m" + str + "\u001B[0m";
        Function<String, String> yellow = str -> "\u001B[33m" + str + "\u001B[0m";
        System.out.print("TEST CASE " + constLen(String.valueOf(n), 4));
        System.out.print("��������: " + yellow.apply(constLen(exp, minLen)) + " ����������: " + green.apply(constLen(act, minLen) + " "));
        if (Objects.equals(exp, act)) System.out.print("?");
        else System.out.print("?");
        System.out.println();
    }

}