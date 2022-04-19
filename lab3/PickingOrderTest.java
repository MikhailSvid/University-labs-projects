package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PickingOrderTest {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);
    private String getAppleType(PickingOrder p) {
        String v="";
        try {
            Field name = PickingOrder.class.getDeclaredField("appleType");
            name.setAccessible(true);
            v = (String)name.get(p);

        } catch (Exception x) {
            fail("exception occurred trying to get this.getAppleType");
            System.out.println(x);
        }
        return v;
    }

    private String getBagSize(PickingOrder p) {
        String v="";
        try {
            Field name = PickingOrder.class.getDeclaredField("bagSize");
            name.setAccessible(true);
            v = (String)name.get(p);

        } catch (Exception x) {
            fail("exception occurred trying to get this.getBagSize");
            System.out.println(x);
        }
        return v;
    }

    @Test
    public void test_0_0_() {
        PickingOrder c = new PickingOrder();
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Cortland";
        String expectedSize = "TenLB";

        String errorType = String.format(
                "\n Test no-arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test no-arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }
    @Test
    public void test_1_0_() {
        PickingOrder c = new PickingOrder("Empire","FifteenLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Empire";
        String expectedSize = "FifteenLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_1_1_() {
        PickingOrder c = new PickingOrder("McIntosh","FifteenLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "McIntosh";
        String expectedSize = "FifteenLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_1_2_() {
        PickingOrder c = new PickingOrder("Cortland","FifteenLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Cortland";
        String expectedSize = "FifteenLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }


    @Test
    public void test_1_3_() {
        PickingOrder c = new PickingOrder("Gala","FifteenLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Gala";
        String expectedSize = "FifteenLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }


    @Test
    public void test_2_0_() {
        PickingOrder c = new PickingOrder("Empire","TwentyLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Empire";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_2_1_() {
        PickingOrder c = new PickingOrder("McIntosh","TwentyLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "McIntosh";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_2_2_() {
        PickingOrder c = new PickingOrder("Cortland","TwentyLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Cortland";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }


    @Test
    public void test_2_3_() {
        PickingOrder c = new PickingOrder("Gala","TwentyLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Gala";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }



    @Test
    public void test_3_0_() {
        PickingOrder c1 = new PickingOrder("Gala","TwentyLB");
        PickingOrder c = new PickingOrder(c1);
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Gala";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_3_1_() {
        PickingOrder c1 = new PickingOrder("Empire","TwentyLB");
        PickingOrder c = new PickingOrder(c1);
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Empire";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_3_2_() {
        PickingOrder c1 = new PickingOrder("McIntosh","TwentyLB");
        PickingOrder c = new PickingOrder(c1);
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "McIntosh";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_3_3_() {
        PickingOrder c1 = new PickingOrder("Cortland","TwentyLB");
        PickingOrder c = new PickingOrder(c1);
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Cortland";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }


    @Test
    public void test_4_0_() {
        PickingOrder c = new PickingOrder("Honeycrisp","FiveLB");
        c.setAppleType("Empire");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Empire";
        String expectedSize = "FiveLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_4_1_() {
        PickingOrder c = new PickingOrder("Empire","FiveLB");
        c.setAppleType("Honeycrisp");

        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Honeycrisp";
        String expectedSize = "FiveLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_4_2_() {
        PickingOrder c = new PickingOrder("McIntosh","TwentyLB");
        c.setAppleType("Gala");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Gala";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_4_3_() {
        PickingOrder c = new PickingOrder("Cortland","TwentyLB");
        c.setAppleType("McIntosh");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "McIntosh";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_5_0_() {
        PickingOrder c = new PickingOrder("Honeycrisp","FiveLB");
        c.setBagSize("TenLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Honeycrisp";
        String expectedSize = "TenLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_5_1_() {
        PickingOrder c = new PickingOrder("Empire","FiveLB");
        c.setBagSize("TenLB");

        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Empire";
        String expectedSize = "TenLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_5_2_() {
        PickingOrder c = new PickingOrder("McIntosh","TwentyLB");
        c.setBagSize("FiveLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "McIntosh";
        String expectedSize = "FiveLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_5_3_() {
        PickingOrder c = new PickingOrder("Cortland","TwentyLB");
        c.setBagSize("TwentyLB");
        String actualType = this.getAppleType(c);
        String actualSize = this.getBagSize(c);

        String expectedType = "Cortland";
        String expectedSize = "TwentyLB";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorSize = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualSize, expectedSize);

        assertTrue(errorSize, expectedSize.equals(actualSize));

    }

    @Test
    public void test_6_0_() {
        PickingOrder c = new PickingOrder("Honeycrisp","FiveLB");

        double actualprice = c.getPickingOrderPrice();
        double expectedprice = 41.0;
        final double THRESHOLD = .01;
        String errorPrice = String.format(
                "\n Test getPickingOrderPrice  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actualprice, expectedprice);
        assertTrue(errorPrice, Math.abs(expectedprice - actualprice) < THRESHOLD);

    }

    @Test
    public void test_6_1_() {
        PickingOrder c = new PickingOrder("McIntosh","FiveLB");

        double actualprice = c.getPickingOrderPrice();
        double expectedprice = 33.8;
        final double THRESHOLD = .01;
        String errorPrice = String.format(
                "\n Test getPickingOrderPrice  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actualprice, expectedprice);
        assertTrue(errorPrice, Math.abs(expectedprice - actualprice) < THRESHOLD);

    }
    @Test
    public void test_6_2_() {
        PickingOrder c = new PickingOrder("McIntosh","TenLB");

        double actualprice = c.getPickingOrderPrice();
        double expectedprice = 44.9;
        final double THRESHOLD = .01;
        String errorPrice = String.format(
                "\n Test getPickingOrderPrice  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actualprice, expectedprice);
        assertTrue(errorPrice, Math.abs(expectedprice - actualprice) < THRESHOLD);

    }
    @Test
    public void test_6_3_() {
        PickingOrder c = new PickingOrder("Empire","TenLB");

        double actualprice = c.getPickingOrderPrice();
        double expectedprice = 43.7;
        final double THRESHOLD = .01;
        String errorPrice = String.format(
                "\n Test getPickingOrderPrice  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actualprice, expectedprice);
        assertTrue(errorPrice, Math.abs(expectedprice - actualprice) < THRESHOLD);

    }


    @Test
    public void test_17_0_Exception() {
        try {
            // create object with wrong cup size
            PickingOrder c = new PickingOrder("McIntoshh","TenLB");
            fail();
        }
        catch (IllegalArgumentException e) {
            // exception is expected and we catch it
        }
    }


    @Test
    public void test_17_1_Exception() {
        try {
            // create object with wrong cup size
            PickingOrder c = new PickingOrder("McIntosh","TennLB");
            fail();
        }
        catch (IllegalArgumentException e) {
            // exception is expected and we catch it
        }
    }
    @Test
    public void test_17_2_Exception() {
        try {
            // create object with wrong cup size
            PickingOrder c = new PickingOrder("McIntosh","TenLB");
            c.setBagSize("TLB");
            fail();
        }
        catch (IllegalArgumentException e) {
            // exception is expected and we catch it
        }
    }

    @Test
    public void test_17_3_Exception() {
        try {
            // create object with wrong cup size
            PickingOrder c = new PickingOrder("McIntosh","TenLB");
            c.setAppleType("EMPir");
            fail();
        }
        catch (IllegalArgumentException e) {
            // exception is expected and we catch it
        }
    }
}