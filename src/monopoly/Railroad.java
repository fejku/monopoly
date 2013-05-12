package monopoly;

import java.util.Collection;

public class Railroad extends AProperty {

	private RState state = RState.UNOWNED;

	public static Railroad makePennsylvania() {
		return new Railroad("Pennsylvania Railroad");
	}

	public static Railroad makeReaching() {
		return new Railroad("Reaching Railroad");
	}

	protected Railroad(String name) {
		super(name, Constants.RAILROAD_PRICE);
	}

	@Override
	public IAction action(Player current, Collection<Player> others, IDice dice) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isMortgaged() {
		// TODO Auto-generated method stub
		return false;
	}

	protected boolean isOwned() {
		return !RState.UNOWNED.equals(this.state);
	}

	@Override
	protected void setOwnedState() {
		if (this.state == RState.UNOWNED) {
			this.state = RState.OWNED;
		}
	}

	@Override
	protected int calculateRent() {
		if (this.isOwned()) {
			return Constants.RAILROAD_BASE_RENT * owner.countRailroads();
		}
		return 0;
	}
	
	

	@Override
	public boolean isRailroad() {
		// TODO Auto-generated method stub
		return true;
	}

	public RState getState() {
		return this.state;
	}

}