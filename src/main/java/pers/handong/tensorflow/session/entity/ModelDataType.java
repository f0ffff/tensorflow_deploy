package pers.handong.tensorflow.session.entity;

/**
 * Model data type
 *
 * @author handong
 */
public enum ModelDataType {
    /**
     * int
     */
    DATA_INT32(Integer.TYPE, 0),
    /**
     * long
     */
    DATA_INT64(Long.TYPE, 1),
    /**
     * float
     */
    DATA_FLOAT(Float.TYPE, 2),
    /**
     * double
     */
    DATA_DOUBLE(Double.TYPE, 3),
    /**
     * boolean
     */
    DATA_BOOLEAN(Boolean.TYPE, 4),
    /**
     * string
     */
    DATA_CHARACTER(Character.TYPE, 5);

    private Class<?> type;
    private int value;

    ModelDataType(Class<?> type, int value) {
        this.type = type;
        this.value = value;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
