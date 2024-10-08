package com.redgogh.tools;

/* -------------------------------------------------------------------------------- *\
|*                                                                                  *|
|*    Copyright (C) 2019-2024 RedGogh All rights reserved.                          *|
|*                                                                                  *|
|*    Licensed under the Apache License, Version 2.0 (the "License");               *|
|*    you may not use this file except in compliance with the License.              *|
|*    You may obtain a copy of the License at                                       *|
|*                                                                                  *|
|*        http://www.apache.org/licenses/LICENSE-2.0                                *|
|*                                                                                  *|
|*    Unless required by applicable law or agreed to in writing, software           *|
|*    distributed under the License is distributed on an "AS IS" BASIS,             *|
|*    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.      *|
|*    See the License for the specific language governing permissions and           *|
|*    limitations under the License.                                                *|
|*                                                                                  *|
\* -------------------------------------------------------------------------------- */

import com.redgogh.tools.exception.AssertException;

/**
 * @author RedGogh
 */
public class Capturer {

    /**
     * 执行指定的无返回值函数，如果发生异常则抛出断言异常。
     *
     * <p>此方法用于执行可能抛出异常的操作，并在发生异常时提供详细的异常信息。
     *
     * @param function 要执行的函数
     * @throws AssertException 如果函数执行时发生异常
     */
    public static void call(VoidFunction function) {
        try {
            function.call();
        } catch (Throwable e) {
            throw new AssertException(e.getMessage());
        }
    }

    /**
     * 执行指定的无返回值函数，如果发生异常则抛出断言异常，并使用自定义的异常信息。
     *
     * <p>此方法用于执行可能抛出异常的操作，并在发生异常时提供详细的异常信息和格式化支持。
     *
     * @param function 要执行的函数
     * @param fmt 自定义异常信息的格式
     * @param args 格式化参数
     * @throws AssertException 如果函数执行时发生异常
     */
    public static void call(VoidFunction function, String fmt, Object... args) {
        try {
            function.call();
        } catch (Throwable e) {
            throw new AssertException(fmt, args);
        }
    }

    /**
     * 执行指定的有返回值函数，如果发生异常则抛出断言异常。
     *
     * <p>此方法用于执行可能抛出异常的操作，并在发生异常时提供详细的异常信息。
     *
     * @param function 要执行的函数
     * @param <T> 返回值的类型
     * @return 函数返回的值；如果发生异常，则抛出 {@link AssertException}
     * @throws AssertException 如果函数执行时发生异常
     */
    public static <T> T call(RetFunction<T> function) {
        try {
            return function.call();
        } catch (Throwable e) {
            throw new AssertException(e.getMessage());
        }
    }

    /**
     * 执行指定的有返回值函数，如果发生异常则抛出断言异常，并使用自定义的异常信息。
     *
     * <p>此方法用于执行可能抛出异常的操作，并在发生异常时提供详细的异常信息和格式化支持。
     *
     * @param function 要执行的函数
     * @param fmt 自定义异常信息的格式
     * @param args 格式化参数
     * @param <T> 返回值的类型
     * @return 函数返回的值；如果发生异常，则抛出 {@link AssertException}
     * @throws AssertException 如果函数执行时发生异常
     */
    public static <T> T call(RetFunction<T> function, String fmt, Object... args) {
        try {
            return function.call();
        } catch (Throwable e) {
            throw new AssertException(fmt, args);
        }
    }

}
