package com.mcb.administration.dto;

import com.mcb.administration.model.Evaluation;

public class EvaluationValueObject {

    private  String name;
    private  String description;

    public EvaluationValueObject(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
    }

    public EvaluationValueObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Builder EvaluationBuilder() {
        return new Builder();
    }

    public static Builder EvaluationBuilder(EvaluationValueObject object) {
        return new Builder(object);
    }

    public static class  Builder {
        private String name;
        private String description;

        public Builder (){

        }

        public Builder (EvaluationValueObject object){
            this.name = object.name;
            this.description = object.description;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public EvaluationValueObject build() {
            return new EvaluationValueObject(this);
        }

    }
}
