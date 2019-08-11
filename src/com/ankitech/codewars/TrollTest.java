package com.ankitech.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {

    @Test
    public void disemvowel() {
        assertEquals("Ths wbst s fr lsrs LL!",Troll.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));
    }
}