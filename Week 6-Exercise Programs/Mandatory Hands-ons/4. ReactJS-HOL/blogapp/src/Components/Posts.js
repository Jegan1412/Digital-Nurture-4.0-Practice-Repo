import React from "react";
import { Post } from "./Post";

export class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            error: null
        };
    }
    async loadPosts() {
        try {
            const response = await fetch("https://jsonplaceholder.typicode.com/posts");
            if (!response.ok) {
                throw new Error("Failes to Fetch Posts");
            }
            const posts = await response.json();
            this.setState({ posts: posts });
        }
        catch (error) {
            this.setState({ error: error.message });
        }
    }
    componentDidMount() {
        this.loadPosts();
    }
    
    render() {
        const { posts, error } = this.state;

        const postStyle = {
            border: "1px solid black",
            margin: "10px",
            padding: "10px"
        }

        if (error) return <div>Error: {error}</div>

        return (

            <div>
                <h1>All Posts</h1>
                {posts.map(post => (
                    <div className="post" style={postStyle}>
                        <new Post key={post.id}>
                            <li>ID: {post.id}</li>
                            <li>Title: {post.title}</li>
                            <li>Body: {post.body}</li>
                        </new>
                        <br/>
                    </div>
                ))}
            </div>

        );
    }
    componentDidCatch(error, info) {
        alert(error, info);
    }
}