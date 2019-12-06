package org.sumanit.jvm.constant;

import org.sumanit.jvm.ByteBufferReaderUtil;

import java.nio.ByteBuffer;

/**
 * Created by 苏曼 on 2019/12/2.
 */
public class InvokeDynamicInfo extends Constant {
    private short bootstrapMethodAttrIndex;
    private short nameAndTypeIndex;
    @Override
    public void read(ByteBuffer buf) {
        bootstrapMethodAttrIndex = ByteBufferReaderUtil.readShort(buf);
        nameAndTypeIndex = ByteBufferReaderUtil.readShort(buf);
    }

    @Override
    public String toString() {
        return "InvokeDynamicInfo{" +
                "bootstrapMethodAttrIndex=" + bootstrapMethodAttrIndex +
                ", nameAndTypeIndex=" + nameAndTypeIndex +
                '}';
    }
}
