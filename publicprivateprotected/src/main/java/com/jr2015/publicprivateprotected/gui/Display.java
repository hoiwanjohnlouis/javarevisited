package com.jr2015.publicprivateprotected.gui;

import com.jr2015.publicprivateprotected.build.Builder;

/**
 * Copyright 8/22/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Package com.hwtechservices.jr2015.publicprivateprotected.gui
 * Project publicprivateprotected
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class Display extends Builder {

    public void show(){ System.out.println(getVersion());
    // Ok, protected method can be called from subclass outside package

    }

}

