package com.simitchiyski.interviewprep.designPatterns.builder.fluent;

public class Email {
    private final String from;
    private final String to;
    private final String subject;
    private final String content;

    private Email(Builder builder) {
        from = builder.from;
        to = builder.to;
        subject = builder.subject;
        content = builder.content;
    }

    public static To from(final String from) {
        return new Builder().from(from);
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    interface From {
        To from(String from);
    }

    interface To {
        Subject to(String to);
    }

    interface Subject {
        Content subject(String subject);
    }

    interface Content {
        Build content(String content);
    }

    interface Build {
        Email build();
    }

    static class Builder implements From, To, Subject, Content, Build {
        private String from;
        private String to;
        private String subject;
        private String content;

        @Override
        public To from(final String from) {
            this.from = from;
            return this;
        }

        @Override
        public Subject to(final String to) {
            this.to = to;
            return this;
        }

        @Override
        public Content subject(final String subject) {
            this.subject = subject;
            return this;
        }

        @Override
        public Build content(final String content) {
            this.content = content;
            return this;
        }

        @Override
        public Email build() {
            return new Email(this);
        }
    }
}


