class User {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Post {
    private int id;
    private int userId;
    private String content;
    private int likes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}

class Comment {
    private int id;
    private int postId;
    private int userId;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public class SocialMedia {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Alex");
        user.setId(1);
        user.setEmail("alex@example.com");

        Post post = new Post();
        post.setId(101);
        post.setUserId(user.getId());
        post.setContent("Hello, world!");
        post.setLikes(10);

        Comment comment = new Comment();
        comment.setId(201);
        comment.setPostId(post.getId());
        comment.setUserId(user.getId());
        comment.setText("Great post!");

        System.out.println("---SOCIAL MEDIA---");
        System.out.println(" ");

        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
        System.out.println(
                "Post ID: " + post.getId() + ", Content: " + post.getContent() + ", Likes: " + post.getLikes());
        System.out.println("Comment: " + comment.getText() + ", By User ID: " + comment.getUserId());

        System.out.println(" ");
    }
}
