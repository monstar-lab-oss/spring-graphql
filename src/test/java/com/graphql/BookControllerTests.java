package com.graphql;

import com.graphql.web.BookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(BookController.class)
public class BookControllerTests {

    @Autowired
    private GraphQlTester graphQlTester;

//    @Test
//    void shouldGetFirstBook() {
//        this.graphQlTester
//				.documentName("bookDetails")
//				.variable("id", 1)
//                .execute()
//                .path("bookById")
//                .matchesJson("""
//                    {
//                        "id": 1,
//                        "name": "Effective Java",
//                        "pageCount": 416,
//                        "author": {
//                          "firstName": "Joshua",
//                          "lastName": "Bloch"
//                        }
//                    }
//                """);
//    }
}