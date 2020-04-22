package com.spring.web.ToDoItem;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//@builder doen't working on eclipes *does on IntelliJ
public class ToDoItemRequest {

private String id;
private String title;
private boolean isDone;

}

