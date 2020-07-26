import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * The test class Marianne -- originally called TestAssignment2,
 * but renamed to a human name on the premise that there might be conflict
 * with a student-selected class name.  (This assignment includes creation
 * of a JUnit test module.)
 *
 * @author  James Pede
 * @version Jul4'15,2137h
 */
public class Marianne
{
    private static final String MINOR_ERROR_MESSAGE = "-1 point.";
    private static final String MAJOR_ERROR_MESSAGE = MINOR_ERROR_MESSAGE + "  The amount of lines in your solution is not the same as the amount of lines in my solution.";
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String TESTCODE_PREFIX = "final String EXPECTED = \"";
    private static final String TESTCODE_NEWLINE = "\"" + NEWLINE + "\t+ NEWLINE + \"";
    private static final String TESTCODE_SUFFIX = "\";" + NEWLINE;
    private static final boolean PRODUCE_JUNIT_CODE = false;

    private static final int AIRPLANE = 0;
    private static final int BOAT = 1;
    private static final int CAR = 2;
    private static final int VEHICLE = 3;
    private static final int STEERABLE = 4;
    private static final int INTERFACE_PARENT = 5;
    private static final int OBJECT = 6;

    private static final int ACCELERATE = 0;
    private static final int STEER_LEFT = 1;
    private static final int STEER_RIGHT = 2;
    private static final int STANDARD_TOSTRING = 3;
    private static final int DISPARATE_TOSTRING = 4;

    private static final Class<?> NOT_IMPLEMENTED = Object.class;

    /*
    * add your package name in front of each class-name string
    *
    * e.g. "packagename.Airplane"
    */
    private static final String[] CLASSNAME_OF = new String[] {
            "Airplane",
            "Boat",
            "Car",
            "Vehicle",
            "Steerable",
            "Interfaces do not have parents",
            "Object"
        };
    private static Class<?>[] CLASS_OF = new Class<?>[CLASSNAME_OF.length];
    private static final String[][] TEST_STRINGS = new String[][] {
            new String[] {
                "fire engines on wings" + NEWLINE,
                "lift wing flaps to turn left" + NEWLINE,
                "lift wing flaps to turn right" + NEWLINE,
                "This airplane is a 1970 Make Model that can reach 1333 feet.",
                "This airplane is a 2000 Fake Yodel that can reach 332 feet.",
            },

            new String[] {
                "jet water" + NEWLINE,
                "turn tiller left" + NEWLINE,
                "turn tiller right" + NEWLINE,
                "This boat is a 1970 Make Model (with motor).",
                "This boat is a 2000 Fake Yodel (without motor).",
            },

            new String[] {
                "fire pistons, turn wheels" + NEWLINE,
                "turn wheels left" + NEWLINE,
                "turn wheels right" + NEWLINE,
                "This car is a 1970 Make Model with 1333 hp.",
                "This car is a 2000 Fake Yodel with 1322 hp.",
            },
        };

    private static Class<?> clazz = null;

    private static PrintStream stdOut = System.out;
    private ByteArrayOutputStream outContent;
    private PrintStream ps;

    private static final Object[] STANDARD_TEST_SUBJECT = new Object[4];
    private static final Object[] EQUIVALENT_TEST_SUBJECT = new Object[3];
    private static final Object[] INEQUIVALENT_TEST_SUBJECT = new Object[3];
    private static final Object[] DISPARATE_TEST_SUBJECT = new Object[4];
    static {
        for (int classIndex = CLASS_OF.length; 0 != classIndex--;)
            try {
                CLASS_OF[classIndex] = Class.forName(CLASSNAME_OF[classIndex]);

            } catch (ClassNotFoundException studentDidNotImplement) {
                CLASS_OF[classIndex] = NOT_IMPLEMENTED;
            } // end try: class identification

        CLASS_OF[INTERFACE_PARENT] = null;

        resetStandardTestSubjects();

        EQUIVALENT_TEST_SUBJECT[CAR] = worryFreeNew(CAR, 1970, "Make", "Model", 1343);
        EQUIVALENT_TEST_SUBJECT[BOAT] = worryFreeNew(BOAT, 1970, "Make", "Model", true);
        EQUIVALENT_TEST_SUBJECT[AIRPLANE] = worryFreeNew(AIRPLANE, 1970, "Make", "Model", 2333);

        INEQUIVALENT_TEST_SUBJECT[CAR] = worryFreeNew(CAR, 1970, "Make", "Model", 1322);
        INEQUIVALENT_TEST_SUBJECT[BOAT] = worryFreeNew(BOAT, 1970, "Make", "Model", false);
        INEQUIVALENT_TEST_SUBJECT[AIRPLANE] = worryFreeNew(AIRPLANE, 1970, "Make", "Model", 332);

        DISPARATE_TEST_SUBJECT[CAR] = worryFreeNew(CAR, 2000, "Fake", "Yodel", 1322);
        DISPARATE_TEST_SUBJECT[BOAT] = worryFreeNew(BOAT, 2000, "Fake", "Yodel", false);
        DISPARATE_TEST_SUBJECT[AIRPLANE] = worryFreeNew(AIRPLANE, 2000, "Fake", "Yodel", 332);
        DISPARATE_TEST_SUBJECT[VEHICLE] = DISPARATE_TEST_SUBJECT[CAR];
    } // end static initializer

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        outContent = new ByteArrayOutputStream();
        ps = new PrintStream(outContent);
        System.setOut(ps);
    } // end setup

    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        String result = outContent.toString();

        purgeOldTest();
        ps.flush();
        System.setOut(stdOut);

        clazz = null;
    } // end cleanup

    private void purgeOldTest()
    {
        outContent.reset();
    } // end method
    
    private static void resetStandardTestSubjects()
    {
        STANDARD_TEST_SUBJECT[CAR] = worryFreeNew(CAR, 1970, "Make", "Model", 1333);
        STANDARD_TEST_SUBJECT[BOAT] = worryFreeNew(BOAT, 1970, "Make", "Model", true);
        STANDARD_TEST_SUBJECT[AIRPLANE] = worryFreeNew(AIRPLANE, 1970, "Make", "Model", 1333);
        STANDARD_TEST_SUBJECT[VEHICLE] = STANDARD_TEST_SUBJECT[CAR];
    } // end class helper method

    private void verify(String expected)
    {
        String actual = outContent.toString(); // for debug purposes
        stdOut.println(PRODUCE_JUNIT_CODE
            ? (TESTCODE_PREFIX
                    + actual.replaceAll(NEWLINE, TESTCODE_NEWLINE)
                    + TESTCODE_SUFFIX
                ) : actual
        );

        assertEquals(MINOR_ERROR_MESSAGE, expected, actual);        
    } // end method

    /**
     * Acts as a proxy for the 'new' keyword, and in so doing,
     * allows this test module to create objects from the student project
     * without imposing compile-dependency.
     * In other words, this one function makes it so that
     * the test module ALWAYS COMPILES, even in an otherwise empty project.
     * Cool, huh?
     * 
     * @dependency this.CLASS_OF and related static-initializer
     * 
     * @param classIndex    one of the constants that stands in for the student classes
     * @param initargs      an unbounded quantity of parameters, intended for the constructor;
     *                      this parameter name was adopted from java.reflect.Constructor.newInstance()
     */
    private static Object worryFreeNew(int classIndex, Object... initargs)
    {
        if (NOT_IMPLEMENTED == CLASS_OF[classIndex])
            return new Object();
            
        for (java.lang.reflect.Constructor<?> c : CLASS_OF[classIndex].getDeclaredConstructors())
            try 
            {
                return c.newInstance(initargs);

            } catch (ReflectiveOperationException | NoClassDefFoundError everyIterationButOne) {
                // since the preceding loop is responsible for ensuring a match,
                // and other concerns, like available memory, are dismissible.

            } // end try: return a matched instantiation

        return new Object();
    } // end static helper method

    /**
     * This is a multi-stage test.  It is not intended that @Test modules
     * invoke this helper directly, since the Field type is a pain in the keister.
     * Use the overload enforceGoodFieldPractices(int, String...) instead.
     * 
     * The whole thematic purpose of the tests is to verify standard coding practice
     * on *properties*.  Symbolic Constants and Class Variables are meant to be tested
     * as well, but there's a little more work to be done in that regard.
     * 
     * The tests that this method conducts are, in order:
     * 1) Field has the access keyword 'private'.
     * 2) getFieldName() and setFieldName() exist, where "FieldName" is
     *      the proper noun version of the field's name.  (This naming is consistent
     *      with camelCase convention.)
     * 3) getFieldName() and setFieldName() are public methods.
     * 4) "Get" a value A from the Standard Test Subject at this property,
     *      and a value B from Disparate Test Subject.  These cannot be the same value.
     *      Value B is seized directly from the object, since getFieldName() cannot
     *      be evaluated properly if it is used as the authority for pre-test value B.
     * 5) "Set" B to A's object at this property.  Verify that A.getFieldName()
     *      now returns B.
     * 
     * It is recommended that a resetStandardTestSubjects() method is used
     * after all the intended enforceGoodFieldPractices() tests are conducted,
     * since it is foreseeable that the contents of the Standards will be
     * corrupted before other dependent tests may be performed.
     * 
     * @dependency  this.STANDARD_TEST_SUBJECT[classIndex]
     * @dependency  this.DISPARATE_TEST_SUBJECT[classIndex];
     *              DISPARATE_TEST_SUBJECTs have all fields completely inequal
     *              to STANDARD_TEST_SUBJECTs -- VERY IMPORTANT.
     *              
     * @param classIndex    one of the constants that stands in for the student classes;
     *                      in this case, it must be *the* class that contains the field,
     *                      since the test isn't smart enough to work with inheritance
     * @param field         the property or Symbolic Constant being tested                     
     */
    private void enforceGoodFieldPractices(int classIndex, Field field)
    {
        String fieldName = field.getName();
        
        assertTrue(String.format(
            "%s  %s.%s is not private.",
            MINOR_ERROR_MESSAGE,
            CLASSNAME_OF[classIndex],
            fieldName
        ),
            Modifier.isPrivate(field.getModifiers())
        );
        
        String properName = Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
        
        Method getter = null;
        try {
            getter = clazz.getDeclaredMethod("get" + properName, new Class<?>[]{});
            
        } catch (NoSuchMethodException studentDidNotWriteOne) {
            fail(String.format(
                "%s  %s.%s does not have an accessor named %s().",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[classIndex],
                fieldName,
                "get" + properName
            ));
        } // end try
        
        Method setter = null;
        try {
            setter = clazz.getDeclaredMethod("set" + properName, new Class<?>[]{field.getType()});
            
        } catch (NoSuchMethodException studentDidNotWriteOne) {
            fail(String.format(
                "%s  %s.%s does not have an mutator named %s().",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[classIndex],
                fieldName,
                "set" + properName
            ));
        } // end try
        
        Object variable = STANDARD_TEST_SUBJECT[classIndex];
        Object control = DISPARATE_TEST_SUBJECT[classIndex];
        
        Method attempted = null;
        try {
            attempted = getter;
            Object variableValue = getter.invoke(variable);
            
            field.setAccessible(true);
                final Object controlValue = field.get(control);
            field.setAccessible(false);
            
            if (controlValue == variableValue)
                throw new IllegalArgumentException("This test cannot be completed due to an error in the formation of the TEST_SUBJECTs.");
        
            attempted = setter;
            setter.invoke(variable, controlValue);
                Object modifiedValue = getter.invoke(variable);
            setter.invoke(variable, variableValue); // Restore old value so as to not corrupt other tests.
            assertEquals(String.format(
                "%s  I set a value for %s.%s and accessed a different value.\n",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[classIndex],
                fieldName
            ),
                controlValue,
                modifiedValue
            );            
            
        } catch (ReflectiveOperationException uhMethodIsNotPublic) {
            fail(String.format(
                "%s  %s.%s() does not seem to be a public method.",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[classIndex],
                attempted.getName()
            ));
        } // end try
    } // end helper method
    
    /**
     * Wrap getDeclaredField() in a try-block for the given
     * String fieldNames.  Conduct the overloaded
     * enforceGoodFieldPractices(int, Field) tests for each fieldName.
     * 
     * @param classIndex    one of the constants that stands in for the student classes;
     *                      in this case, it must be *the* class that contains the field,
     *                      since the test isn't smart enough to work with inheritance
     * @param fieldNames    at least one String that is the symbol for a presumed-existant Field;
     *                      Java's optional-length parameter typing is being used here
     *                      to accept a virtually unlimited list of names
     */
    private void enforceGoodFieldPractices(int classIndex, String... fieldNames)
    {        
        clazz = CLASS_OF[classIndex];
        
        for (String fieldName : fieldNames)
            try {
                enforceGoodFieldPractices(classIndex, clazz.getDeclaredField(fieldName));
                
            } catch (NoSuchFieldException studentMisnamedAField) {
                fail(String.format(
                    "%s  Unable to identify a field in %s named %s.",
                    MINOR_ERROR_MESSAGE,
                    CLASSNAME_OF[classIndex],
                    fieldName
                ));
            }
    } // end helper method
    
    /**
     * Helper method, used in vehicleDoesNotImplementSteerable
     * and enforceSteerableImplementation.
     * 
     * @dependence this.clazz
     * 
     * @return whether the Class type held in 'clazz' is Steerable
     */
    private boolean clazzImplementsSteerable()
    {
        return Arrays.asList(clazz.getInterfaces()).contains(CLASS_OF[STEERABLE]);
    } // end helper method

    /**
     * Helper method, used in airplaneImplementsSteerable,
     * boatImplementsSteerable, and carImplementsSteerable.
     * 
     * @dependence this.vehicleDoesNotImplementSteerable
     * 
     * Tests the following conditions:
     * 1) The parameter-specified class ('clazz') exists.  Failure of this test fails all subtests.
     * 2A) The Vehicle class exists, clazz is Steerable, and clazz extends Vehicle --OR--
     * 2B) clazz implements Steerable.
     * 3AB&C) clazz has methods accelerate, steerLeft, and steerRight --AND--
     *      each of these methods produces the expected output.
     * 
     * @param classIndex    one of the constants that stands in for the student classes
     */
    private void enforceSteerableImplementation(int classIndex)
    {
        String className = CLASSNAME_OF[classIndex];
        Object testSubject = STANDARD_TEST_SUBJECT[classIndex];

        String subtestFailures = "";
        try {
            try {
                vehicleDoesNotImplementSteerable();
                clazz = Class.forName(className);

            } catch (AssertionError fromVehicleDNIS) {
                if (clazz == (clazz = Class.forName(className)).getSuperclass())
                    throw new IllegalArgumentException("Test 2A satisfied.");
            } // end try: Test3A

            if (!clazzImplementsSteerable())
                subtestFailures += String.format(
                    "%s  %s doesn't implement Steerable.\n",
                    MINOR_ERROR_MESSAGE,
                    className
                );

        } catch (ClassNotFoundException e) {
            fail(String.format(
                    "-4 points.  %s doesn't implement Steerable because %s doesn't exist!", className, className));

        } catch (IllegalArgumentException e) {
            // do nothing

        } // end try: Test2B

        int expectedOutput = ACCELERATE;
        for (String methodName : new String[] {"accelerate", "steerLeft", "steerRight"})
            try {
                clazz.getMethod(methodName, new Class<?>[]{})
                .invoke(testSubject, new Object[]{});

                verify(TEST_STRINGS[classIndex][expectedOutput]);

            } catch (ReflectiveOperationException usuallyNoSuchMethod) {
                subtestFailures += String.format(
                    "%s  %s.%s() doesn't seem to exist.\n", 
                    MINOR_ERROR_MESSAGE,
                    className,
                    methodName
                );

            } catch (AssertionError verifyInvokedFail) {
                subtestFailures += String.format(
                    "%s  %s.%s() produced incorrect output.\nExpected: %s\nActual:%s\n", 
                    MINOR_ERROR_MESSAGE,
                    className,
                    methodName,
                    TEST_STRINGS[classIndex][expectedOutput],
                    outContent.toString()
                );

            } finally {
                ++expectedOutput;
                purgeOldTest();
            } // end try: Test 3AB&C

        if (!"".equals(subtestFailures))
            fail(subtestFailures);
    } // end helper method

    /**
     * This method basically outsources Object.equals
     * so that the syntax is [tester.]equals(a, b) instead of a.equals(b).
     * I created the method before I realized that this was unnecessary
     * -- equals() is an Object method, so there's no risk in calling it the normal ways.
     * 
     * @param leftOperand   acts as 'a' in a.equals(b)
     * @param rightOperand  acts as 'b' in a.equals(b)
     * @return              a.equals(b)
     */
    private boolean equals(Object leftOperand, Object rightOperand)
    {
        return leftOperand.equals(rightOperand);
    } // end helper method

    /**
     * The foundation of xEqualsItself() tests.
     * Every object equals itself.  This is an axiom of Java.
     * The student-made equals() should be returning true. 
     * 
     * @param classIndex    one of the constants that stands in for the student classes
     */
    private void enforceSelfEquivalency(int classIndex)
    {
        Object selfTester = STANDARD_TEST_SUBJECT[classIndex];

        assertTrue(String.format(
                "%s  A sample %s object was not equal to itself.",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[classIndex]
            ), equals(selfTester, selfTester));
    } // end helper method

    /**
     * The foundation of xDoesNotEqualY() tests.
     * Vehicles of distinct subtypes are categorically different.
     * The student-made equals() should be returning false. 
     * 
     * @param leftIndex    one of the constants that stands in for the student classes
     * @param rightIndex   one of the constants that stands in for the student classes
     */
    private void preventCrossEquivalency(int leftIndex, int rightIndex)
    {
        assertFalse(String.format(
                "%s  A sample %s object was found to be equal to a %s.",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[leftIndex],
                CLASSNAME_OF[rightIndex]
            ), equals(STANDARD_TEST_SUBJECT[leftIndex], STANDARD_TEST_SUBJECT[rightIndex]));
    } // end helper method

    /**
     * The foundation of xEqualsSimilar() tests.
     * In these cases, two samples have been placed JUST WITHIN the range of being 'equal'.
     * The student-made equals() should be returning true. 
     * 
     * @param classIndex    one of the constants that stands in for the student classes
     */
    private void enforceLikeEquivalency(int classIndex)
    {
        assertTrue(String.format(
                "%s  A sample %s object was not equal to a similar object.",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[classIndex]
            ), equals(STANDARD_TEST_SUBJECT[classIndex], EQUIVALENT_TEST_SUBJECT[classIndex]));
    } // end helper method

    /**
     * The foundation of xDoesNotEqualDissimilar() tests.
     * In these cases, two samples have been placed JUST WITHOUT the range of being 'equal'.
     * The student-made equals() should be returning false. 
     * 
     * @param classIndex    one of the constants that stands in for the student classes
     */
    private void preventUnlikeEquivalency(int classIndex)
    {
        assertFalse(String.format(
                "%s  A sample %s object was found to be equal to a dissimilar.",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[classIndex]
            ), equals(STANDARD_TEST_SUBJECT[classIndex], INEQUIVALENT_TEST_SUBJECT[classIndex]));
    } // end helper method

    /**
     * The foundation of steerableExistsAsAnInterface, and other xIsA(n)Y tests.
     * This method tests 1) for the existence of a class
     * and 2) the class' immediate inheritance.
     * Interfaces actually have a superclass of null;
     * this.CLASS_OF has been prepared in such a way that
     *      parentIndex==INTERFACE_PARENT performs this test.
     * 
     * @param childIndex    one of the constants that stands in for the student classes;
     *                      presumably a subclass of parentIndex's reference
     * @param parentIndex   one of the constants that stands in for the student classes
     */
    private void enforceClassParentage(int childIndex, int parentIndex)
    {
        assertTrue(String.format(
                "%s  %s does not exist in this project.",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[childIndex]
            ), NOT_IMPLEMENTED != CLASS_OF[childIndex]);

        assertEquals(String.format(
                "%s  %s extends or implements something it shouldn't.\nThis message may also appear if you've used 'class' and 'interface' interchangeably.",
                MINOR_ERROR_MESSAGE,
                CLASSNAME_OF[childIndex]
            ), CLASS_OF[childIndex].getSuperclass(), CLASS_OF[parentIndex]);
    } // end helper method

    /**
     * Runs toString() on two samples of a specified class.
     * The samples have been designed to have every property distinct from the other sample,
     * which means that the output will be as divergent as possible.
     * This should prevent the student from programming an invariant return value.
     * 
     * @param classIndex    one of the constants that stands in for the student classes
     */
    private void validateToString(int classIndex)
    {
        try {
            assertEquals(String.format(
                    "%s  %s.toString() returned an incorrect value.",
                    MINOR_ERROR_MESSAGE,
                    CLASSNAME_OF[classIndex]
                ),
                TEST_STRINGS[classIndex][STANDARD_TOSTRING],
                CLASS_OF[classIndex].getMethod("toString", new Class<?>[]{})
                    .invoke(STANDARD_TEST_SUBJECT[classIndex], new Object[]{})
            );

            purgeOldTest();

            assertEquals(String.format(
                    "%s  %s.toString() returned an incorrect value.",
                    MINOR_ERROR_MESSAGE,
                    CLASSNAME_OF[classIndex]
                ),
                TEST_STRINGS[classIndex][DISPARATE_TOSTRING],
                CLASS_OF[classIndex].getMethod("toString", new Class<?>[]{})
                    .invoke(DISPARATE_TEST_SUBJECT[classIndex], new Object[]{})
            );

        } catch (ReflectiveOperationException shouldBeImpossible) {
            // since toString() is inherited from Object

        } // end try
    } // end helper method

    @Test
    public void vehicleDoesNotImplementSteerable()
    {
        try {
            clazz = Class.forName("Vehicle");
            if (clazzImplementsSteerable())
                fail(String.format(
                        "%s  Vehicle implements Steerable.\nWhile Airplane, Boat, and Car are Steerable Vehicles, a hypothetical fourth Vehicle may not be Steerable.",
                        MINOR_ERROR_MESSAGE
                    ));

        } catch (ClassNotFoundException vehicleDNE_soCannotImplementSteerable) {
            // do nothing

        } // end try: verify implements Steerable
    } // end method

    @Test
    public void steerableExistsAsAnInterface()
    {
        enforceClassParentage(STEERABLE, INTERFACE_PARENT);
    } // end test

    @Test
    public void vehicleIsAnObject()
    {
        enforceClassParentage(VEHICLE, OBJECT);
    } // end test

    @Test
    public void airplaneIsAVehicle()
    {
        enforceClassParentage(AIRPLANE, VEHICLE);
    } // end test

    @Test
    public void boatIsAVehicle()
    {
        enforceClassParentage(BOAT, VEHICLE);
    } // end test

    @Test
    public void carIsAVehicle()
    {
        enforceClassParentage(CAR, VEHICLE);
    } // end test

    @Test
    public void airplaneImplementsSteerable()
    {
        enforceSteerableImplementation(AIRPLANE);
    } // end test

    @Test
    public void boatImplementsSteerable()
    {
        enforceSteerableImplementation(BOAT);
    } // end test

    @Test
    public void carImplementsSteerable()
    {
        enforceSteerableImplementation(CAR);
    } // end test

    @Test
    public void airplaneEqualsItself()
    {
        enforceSelfEquivalency(AIRPLANE);
    } // end test

    @Test
    public void airplaneDoesNotEqualBoat()
    {
        preventCrossEquivalency(AIRPLANE, BOAT);
    } // end test

    @Test
    public void airplaneEqualsSimilar()
    {
        enforceLikeEquivalency(AIRPLANE);
    } // end test

    @Test
    public void airplaneDoesNotEqualDissimilar()
    {
        preventUnlikeEquivalency(AIRPLANE);
    } // end test

    @Test
    public void boatEqualsItself()
    {
        enforceSelfEquivalency(BOAT);
    } // end test

    @Test
    public void boatDoesNotEqualCar()
    {
        preventCrossEquivalency(BOAT, CAR);
    } // end test

    @Test
    public void boatEqualsSimilar()
    {
        enforceLikeEquivalency(BOAT);
    } // end test

    @Test
    public void boatDoesNotEqualDissimilar()
    {
        preventUnlikeEquivalency(BOAT);
    } // end test

    @Test
    public void carEqualsItself()
    {
        enforceSelfEquivalency(CAR);
    } // end test

    @Test
    public void carDoesNotEqualAirplane()
    {
        preventCrossEquivalency(CAR, AIRPLANE);
    } // end test

    @Test
    public void carEqualsSimilar()
    {
        enforceLikeEquivalency(CAR);
    } // end test

    @Test
    public void carDoesNotEqualDissimilar()
    {
        preventUnlikeEquivalency(CAR);
    } // end test

    @Test
    public void airplaneToStringLooksGreat()
    {
        validateToString(AIRPLANE);
    } // end test

    @Test
    public void boatToStringLooksGreat()
    {
        validateToString(BOAT);
    } // end test

    @Test
    public void carToStringLooksGreat()
    {
        validateToString(CAR);
    } // end test
    
    @Test
    public void allInstanceVariablesHaveGettersAndSetters()
    {
        enforceGoodFieldPractices(VEHICLE, "yearManufactured", "make", "model");
        enforceGoodFieldPractices(AIRPLANE, "maximumHeightFeet");
        enforceGoodFieldPractices(BOAT, "motorized");
        enforceGoodFieldPractices(CAR, "horsepower");
        
        resetStandardTestSubjects();
    }
} // end JUnit class