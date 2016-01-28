package io.threads.java;

import io.threads.java.model.identify.Identify;
import io.threads.java.model.page.Page;
import io.threads.java.model.remove.Remove;
import io.threads.java.model.track.Track;

/**
 * When a user is first identified in your system (e.g. when they sign up or login), call the Identify method to send
 * Threads the user's information. This should include the user-id, email address, and any other user-specific data you have,
 * such as his or her name, address, or current service plan. You may call Identify as often as you like,
 * adding or changing user traits as needed.
 * <p>
 * After the user has been identified, call Track to track application-specific events such as "Signed Up,"
 * "Upgraded Plan," or "Used Feature Foo." You can include additional event properties as needed, such as the details of
 * the plan the user has upgraded to, the specifics of the feature they used, and so on.
 * <p>
 * Page is used to record web page views for a user.
 * <p>
 * Remove can be used to remove users from Threads. Once they have been removed, no more workflows will trigger for them,
 * and any data stored for the user will be unavailable.
 * <p>
 * All data sent to Threads via the API should be encoded as UTF-8.
 *
 * @author szagriichuk.
 */
public interface ThreadsApi {
    /**
     * Identify a user, with optional traits. Users are individual people you’re
     * tracking, with a user-id and an email address. Users can have additional traits, which are
     * things you know about them such as their date of birth, name, and what plan they have
     * subscribed to. Authentication is via HTTP Basic Auth, with the project Event Key as the
     * username, and an empty password.
     */
    void identify(Identify identify);

    /**
     * Track an event. Events are things your users do on your website or in your app,
     * such as view a page, use a feature, or purchase a product. They can optionally have properties
     * such as the sku of the product purchased or the song played. Authentication is via HTTP Basic
     * Auth, with the project Event Key as the username, and an empty password.
     */
    void track(Track track);

    /**
     * Record a page view. Page view events have an optional 'properties' parameter, which
     * includes additional information about the view, such as the URL and referer. In order to use page
     * views in Threads workflows, be sure to include at least the 'url' property with the full URL of the
     * page that was viewed. Authentication is via HTTP Basic Auth, with the project Event Key as the
     * username, and an empty password.
     */
    void page(Page page);

    /**
     * Remove a user. When a user has been removed, no further workflows will trigger
     * for them, and the information about them will be unavailable in Threads. If you wish to re-add
     * a removed user, you need to Identify them again with all relevant information. Authentication
     * is via HTTP Basic Auth, with the project Event Key as the username, and an empty password.
     */
    void remove(Remove remove);
}
