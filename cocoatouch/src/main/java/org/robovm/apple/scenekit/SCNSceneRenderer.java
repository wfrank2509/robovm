/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.scenekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/SCNSceneRenderer/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "scene")
    SCNScene getScene();
    @Property(selector = "setScene:")
    void setScene(SCNScene v);
    @Property(selector = "sceneTime")
    double getSceneTime();
    @Property(selector = "setSceneTime:")
    void setSceneTime(double v);
    @Property(selector = "delegate")
    SCNSceneRendererDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    void setDelegate(SCNSceneRendererDelegate v);
    @Property(selector = "isPlaying")
    boolean isPlaying();
    @Property(selector = "setPlaying:")
    void setPlaying(boolean v);
    @Property(selector = "loops")
    boolean isLoops();
    @Property(selector = "setLoops:")
    void setLoops(boolean v);
    @Property(selector = "pointOfView")
    SCNNode getPointOfView();
    @Property(selector = "setPointOfView:")
    void setPointOfView(SCNNode v);
    @Property(selector = "autoenablesDefaultLighting")
    boolean isAutoenablesDefaultLighting();
    @Property(selector = "setAutoenablesDefaultLighting:")
    void setAutoenablesDefaultLighting(boolean v);
    @Property(selector = "isJitteringEnabled")
    boolean isJitteringEnabled();
    @Property(selector = "setJitteringEnabled:")
    void setJitteringEnabled(boolean v);
    @Property(selector = "showsStatistics")
    boolean isShowsStatistics();
    @Property(selector = "setShowsStatistics:")
    void setShowsStatistics(boolean v);
    @Property(selector = "overlaySKScene")
    SKScene getOverlaySKScene();
    @Property(selector = "setOverlaySKScene:")
    void setOverlaySKScene(SKScene v);
    @Property(selector = "context")
    EAGLContext getContext();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "hitTest:options:")
    NSArray<SCNHitTestResult> hitTest(@ByVal CGPoint thePoint, SCNHitTestOptions options);
    @Method(selector = "isNodeInsideFrustum:withPointOfView:")
    boolean isNodeInsideFrustum(SCNNode node, SCNNode pointOfView);
    @Method(selector = "projectPoint:")
    @ByVal SCNVector3 projectPoint(@ByVal SCNVector3 point);
    @Method(selector = "unprojectPoint:")
    @ByVal SCNVector3 unprojectPoint(@ByVal SCNVector3 point);
    @Method(selector = "prepareObject:shouldAbortBlock:")
    boolean prepareObject(NSObject object, @Block Block0<Boolean> block);
    @Method(selector = "prepareObjects:withCompletionHandler:")
    void prepareObjects(NSArray<?> objects, @Block VoidBooleanBlock completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}