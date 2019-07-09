/*
 * Copyright (c) 2019 Baozun All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Baozun. You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with Baozun.
 * <p>
 * BAOZUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. BAOZUN SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package com.luo.study002.enums;

public enum ErrorCode {

    INSERT_FAIL(400000, "insert fail"),
    OK(200, "OK");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
