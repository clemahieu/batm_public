/*************************************************************************************
 * Copyright (C) 2014-2021 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.batm.server.extensions.extra.nano.util;

/** Tokenizer allowing empty values and skipping. */
public class StringTokenizerV2 {

    private final String[] tokens;
    private int tokenIndex = 0;

    public StringTokenizerV2(String[] tokens) {
        this.tokens = tokens;
    }


    public String next() {
        return tokens[tokenIndex++];
    }

    public boolean hasNext() {
        return tokens.length > tokenIndex;
    }

    public void skip(int n) {
        tokenIndex += n;
    }

}
