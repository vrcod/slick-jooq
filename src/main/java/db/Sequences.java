/*
 * This file is generated by jOOQ.
*/
package db;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_1B145E5E_ECFF_420B_B2DF_B69DD98FDFDB</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_1B145E5E_ECFF_420B_B2DF_B69DD98FDFDB = new SequenceImpl<Long>("SYSTEM_SEQUENCE_1B145E5E_ECFF_420B_B2DF_B69DD98FDFDB", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
