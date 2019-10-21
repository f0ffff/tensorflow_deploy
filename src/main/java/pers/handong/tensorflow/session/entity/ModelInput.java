package pers.handong.tensorflow.session.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Model input
 *
 * @author handong
 */
public class ModelInput {
    private Object reqUuid;
    private ArrayList<ModelParam> placeHolderInput = new ArrayList<>();
    private Map<String, ModelDataType> expectedOutput = new HashMap<>();

    public void addParam(ModelParam param) {
        this.placeHolderInput.add(param);
    }

    public void addExceptedOutput(String outputName, ModelDataType type) {
        this.expectedOutput.put(outputName, type);
    }

    public Object getReqUuid() {
        return reqUuid;
    }

    public void setReqUuid(Object reqUuid) {
        this.reqUuid = reqUuid;
    }

    public ArrayList<ModelParam> getPlaceHolderInput() {
        return placeHolderInput;
    }

    public void setPlaceHolderInput(ArrayList<ModelParam> placeHolderInput) {
        this.placeHolderInput = placeHolderInput;
    }

    public Map<String, ModelDataType> getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(Map<String, ModelDataType> expectedOutput) {
        this.expectedOutput = expectedOutput;
    }
}
