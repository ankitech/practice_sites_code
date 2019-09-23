package com.ankitech.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GradingStudentTest {

    @Test
    public void gradingStudents() {
        List<Integer> expected = Arrays.asList(75,67,40,33);
        assertArrayEquals(expected.toArray(), GradingStudent.gradingStudents(Arrays.asList(73,67,38,33)).toArray());
    }
}