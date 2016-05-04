package work.beltran.discogsbrowser.api;

import rx.Observable;
import rx.Scheduler;
import work.beltran.discogsbrowser.api.model.RecordCollection;
import work.beltran.discogsbrowser.api.model.UserIdentity;

/**
 * Created by Miquel Beltran on 04.05.16.
 * More on http://beltran.work
 */
public class CollectionRecordsList extends RecordsList<RecordCollection> {
    protected CollectionRecordsList(DiscogsService service,
                                    Observable<UserIdentity> userIdentityObservable,
                                    Scheduler subscribeOnScheduler,
                                    Scheduler observeOnScheduler) {
        super(service, userIdentityObservable, subscribeOnScheduler, observeOnScheduler);
    }

    @Override
    protected Observable<RecordCollection> serviceCallToGetRecords(UserIdentity userIdentity, int nextPage) {
        return service.listRecords(userIdentity.getUsername(), nextPage);
    }
}
