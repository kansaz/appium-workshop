package io.github.martinschneider.appium.android.swipe;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 *
 *
 * <h2>Demo Appium Swipe Actions</h2>
 *
 * Test: Swipe up,down, left and right
 *
 * <p>Learning points:
 *
 * <ul>
 *   <li>Detecting coordinates
 *   <li>Different swiping actions
 * </ul>
 *
 * @author Syam Sasi, syamsasi99@gmail.com
 */
public class AndroidSwipeTest extends SwipeTest {

  @BeforeClass
  public void setPlatform() throws MalformedURLException {
    launchApp("android");
  }
  @Test
  public void swipeTest() throws InterruptedException {
    goToNativeComponents();

    doSwipe("right");
    doSwipe("down");
    doSwipe("up");
    doSwipe("left");
  }
}
