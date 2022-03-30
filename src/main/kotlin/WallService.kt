class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val postId = post.copy(id = post.id + 100)
        posts += postId
        return posts.last()

    }

    fun update(post: Post): Boolean {
        var x = true
        for ((index, post1) in posts.withIndex()) {
            if (post1.id == post.id) {
                posts[index] = post1.copy(
                    id = post.id,
                    post.ownerId,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    post.date,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    copyright = post.copyright,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    postponedId = post.postponedId,

                    Comments(
                        count = post.comments.count,
                        canPost = post.comments.canPost,
                        groupsCanPosts = post.comments.groupsCanPosts,
                        canClose = post.comments.canClose,
                        canOpen = post.comments.canOpen
                    ),

                    Reposts(
                        count = post.reposts.count,
                        userReposted = post.reposts.userReposted
                    ),
                    Likes(
                        count = post.likes.count,
                        userLikes = post.likes.userLikes,
                        canLike = post.likes.canLike,
                        canPublish = post.likes.canPublish
                    )
                )
                x = true

            } else x = false

        }

        return x
    }
}




