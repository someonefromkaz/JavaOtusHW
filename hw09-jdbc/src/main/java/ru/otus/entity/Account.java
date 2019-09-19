package ru.otus.entity;

import ru.otus.jdbc.annotation.Id;

public class Account {
    
    @Id
    private long no;
    
    private String type;
    
    private Number rest;
    
    @Override
    public String toString() {
        return "Account{" +
               "no=" + no +
               ", type='" + type + '\'' +
               ", rest=" + rest +
               '}';
    }
    
    public long getNo() {
        return no;
    }
    
    public void setNo(long no) {
        this.no = no;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Number getRest() {
        return rest;
    }
    
    public void setRest(Number rest) {
        this.rest = rest;
    }
}