/***************************************************************************
 * Copyright (c) March, 2016 HW Tech Services, LLC
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
 ***************************************************************************/
package com.jr2016.copynonemptydirectory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/***************************************************************************
 * Program Synopsis
 * <p>
 * Login   HW Tech Services, LLC
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio.
 * Praesent libero.
 * <p>
 * Change History
 * ------Who----- ---When--- ---------------------What----------------------
 * H. Melville    1851.01.31 Wooden whales, or whales cut in profile out of
 * the small dark slabs of the noble South Sea war-wood, are frequently met
 * with in the forecastles of American whalers. Some of them are done with
 * much accuracy.
 ***************************************************************************/
public class CopyNonEmptyDirectoryUsingJava7 {

    public static void copyDirectory(File sourceDir, File targetDir) throws IOException {
        if (sourceDir.isDirectory()) {
            copyDirectoryRecursively(sourceDir, targetDir);
        }
        else {
            // use options if needed by adding the third parameter COPY_OPTIONS:
            // REPLACE_EXISTING, COPY_ATTRIBUTE, NOFOLLOW_LINKS, COPY_ATTRIBUTE, etc
            Files.copy(sourceDir.toPath(), targetDir.toPath());
        }
    }

    // recursive method to copy directory and sub-directory in Java
    private static void copyDirectoryRecursively(File source, File target) throws IOException {
        if (!target.exists()) {
            target.mkdir();
        }
        for (String child : source.list()) {
            copyDirectory(new File(source, child), new File(target, child));
        }
    }

}