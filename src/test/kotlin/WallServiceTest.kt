import org.junit.Assert
import org.junit.Test

class WallServiceTest {

    private var posts = emptyArray<Post>()

    @Test
    fun addIdNotNull() {
        val service = WallService()
        val id1: Long = 0
        val post = Post(
            id = 0,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            copyright = "890",
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
        )
        val result = service.add(post)

        Assert.assertEquals(id1, result.id)
    }

    @Test
    fun updateTrue() {

        val service = WallService()

        service.add(
            Post(
                id = 0,
                ownerId = 12366,
                fromId = 3456,
                createdBy = 565656,
                date = 51222,
                text = "Любой текст",
                replyOwnerId = 1234,
                replyPostId = 89056,
                friendsOnly = 1,
                copyright = "890",
                postType = "5443",
                signerId = "23457",
                canPin = true,
                canDelete = false,
                canEdit = false,
                isPinned = 1,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 343,
                Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
                Reposts(count = 34, userReposted = true),
                Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
            )
        )

        val update = Post(
            id = 100,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            copyright = "890",
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
        )

        val result = service.update(update)

        Assert.assertTrue(result)
    }

    @Test
    fun updateFalse() {

        val service = WallService()

        service.add(
            Post(
                id = 1,
                ownerId = 12366,
                fromId = 3456,
                createdBy = 565656,
                date = 51222,
                text = "Любой текст",
                replyOwnerId = 1234,
                replyPostId = 89056,
                friendsOnly = 1,
                copyright = "890",
                postType = "5443",
                signerId = "23457",
                canPin = true,
                canDelete = false,
                canEdit = false,
                isPinned = 1,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 343,
                Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
                Reposts(count = 34, userReposted = true),
                Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
            )
        )

        val update = Post(
            id = 100,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            copyright = "890",
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
        )

        val result = service.update(update)

        Assert.assertFalse(result)
    }

}



