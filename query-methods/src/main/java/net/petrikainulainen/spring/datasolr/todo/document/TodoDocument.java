package net.petrikainulainen.spring.datasolr.todo.document;

import org.apache.solr.client.solrj.beans.Field;

/**
 * @author Petri Kainulainen
 */
public class TodoDocument {

    @Field("id")
    private Long id;

    @Field("description")
    private String description;

    @Field("title")
    private String title;

    public TodoDocument() {

    }

    public static Builder getBuilder(String title) {
        return new Builder(title);
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder {
        private TodoDocument build;

        public Builder(String title) {
            build = new TodoDocument();
            build.title = title;
        }

        public Builder description(String description) {
            build.description = description;
            return this;
        }

        public TodoDocument build() {
            return build;
        }
    }
}
